/*
 * generated by Xtext
 */
package org.eclipse.emf.ecore.xcore.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;
import org.eclipse.emf.codegen.ecore.genmodel.GenTypeParameter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.xcore.XClassifier;
import org.eclipse.emf.ecore.xcore.XOperation;
import org.eclipse.emf.ecore.xcore.XcorePackage;
import org.eclipse.emf.ecore.xcore.util.XcoreEcoreBuilder;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class XcoreScopeProvider extends XbaseScopeProvider  {
  
  @Override
  public IScope getScope(final EObject context, EReference reference)
  {
    if (reference == XcorePackage.Literals.XREFERENCE__OPPOSITE)
    {
      return 
        new AbstractScope(IScope.NULLSCOPE, false)
        {
          @Override
          protected Iterable<IEObjectDescription> getAllLocalElements()
          {
            ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
            GenFeature genFeature = (GenFeature)XcoreEcoreBuilder.getGen(XcoreEcoreBuilder.get(context));
            GenClass genClass = genFeature.getTypeGenClass();
            if (genClass != null)
            {
  						for (GenFeature opposite : genClass.getGenFeatures())
              {
              	if (opposite.isReferenceType())
              	{
              		result.add(new EObjectDescription(QualifiedName.create(opposite.getName()), opposite, null));
              	}
              }
            }
            return result;
          }
        };
    }
    else if (reference == XcorePackage.Literals.XREFERENCE__KEYS)
    {
      return 
        new AbstractScope(IScope.NULLSCOPE, false)
        {
          @Override
          protected Iterable<IEObjectDescription> getAllLocalElements()
          {
            ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
            GenFeature genFeature = (GenFeature)XcoreEcoreBuilder.getGen(XcoreEcoreBuilder.get(context));
            GenClass genClass = genFeature.getTypeGenClass();
            if (genClass != null)
            {
              for (GenFeature key : genClass.getGenFeatures())
              {
              	if (!key.isReferenceType())
              	{
              		result.add(new EObjectDescription(QualifiedName.create(key.getName()), key, null));
              	}
              }
            }
            return result;
          }
        };
      
    }
    else
    {
      IScope scope = super.getScope(context, reference);
      if (reference == XcorePackage.Literals.XGENERIC_TYPE__TYPE)
      {
        return 
          new AbstractScope(scope, false)
          {
            void handleGenTypeParameters(List<IEObjectDescription> result, EList<GenTypeParameter> genTypeParameters)
            {
              for (final GenTypeParameter genTypeParameter : genTypeParameters)
              {
                result.add(new EObjectDescription(QualifiedName.create(genTypeParameter.getName()), genTypeParameter, null));
              }
            }
  
            @Override
            protected Iterable<IEObjectDescription> getAllLocalElements()
            {
              ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
              for (EObject eObject = context; eObject != null; eObject = eObject.eContainer())
              {
                if (eObject instanceof XOperation)
                {
                  GenOperation genOperation = (GenOperation)XcoreEcoreBuilder.getGen(XcoreEcoreBuilder.get(eObject));
                  handleGenTypeParameters(result, genOperation.getGenTypeParameters());
                }
                else if (eObject instanceof XClassifier)
                {
                  GenClassifier genClassifier = (GenClassifier)XcoreEcoreBuilder.getGen(XcoreEcoreBuilder.get(eObject));
                  handleGenTypeParameters(result, genClassifier.getGenTypeParameters());
                  break;
                }
              }
              return result;
            }
          };
      }
      else
      {
        return scope;
      }
    }
  }
}
