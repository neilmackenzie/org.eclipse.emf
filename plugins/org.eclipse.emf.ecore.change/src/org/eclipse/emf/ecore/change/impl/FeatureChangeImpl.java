/**
 * <copyright>
 *
 * Copyright (c) 2003-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: FeatureChangeImpl.java,v 1.2 2004/03/15 15:01:26 marcelop Exp $
 */
package org.eclipse.emf.ecore.change.impl;


import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.change.ChangeFactory;
import org.eclipse.emf.ecore.change.ChangeKind;
import org.eclipse.emf.ecore.change.ChangePackage;
import org.eclipse.emf.ecore.change.FeatureChange;
import org.eclipse.emf.ecore.change.ListChange;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecore.change.impl.FeatureChangeImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclipse.emf.ecore.change.impl.FeatureChangeImpl#getDataValue <em>Data Value</em>}</li>
 *   <li>{@link org.eclipse.emf.ecore.change.impl.FeatureChangeImpl#isSet <em>Set</em>}</li>
 *   <li>{@link org.eclipse.emf.ecore.change.impl.FeatureChangeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.emf.ecore.change.impl.FeatureChangeImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.emf.ecore.change.impl.FeatureChangeImpl#getReferenceValue <em>Reference Value</em>}</li>
 *   <li>{@link org.eclipse.emf.ecore.change.impl.FeatureChangeImpl#getListChanges <em>List Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureChangeImpl extends EObjectImpl implements FeatureChange
{
  /**
   * The default value of the '{@link #isSet() <em>Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSet()
   * @generated
   * @ordered
   */
  protected static final boolean SET_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isSet() <em>Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSet()
   * @generated
   * @ordered
   */
  protected boolean set = SET_EDEFAULT;

  /**
   * The cached value of the '{@link #getListChanges() <em>List Changes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListChanges()
   * @generated
   * @ordered
   */
  protected EList listChanges = null;

  protected Object featureField = null;

  protected Object valueField = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureChangeImpl()
  {
    super();
  }

  protected FeatureChangeImpl(EStructuralFeature feature, Object value, boolean isSet)
  {
    this();
    this.featureField = feature;
    setValue(value);
    this.set = isSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass()
  {
    return ChangePackage.eINSTANCE.getFeatureChange();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String getFeatureName()
  {
    return
      featureField == null ? 
        null :
        featureField instanceof String ?
          (String)featureField :
          ((EStructuralFeature)featureField).getName();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void setFeatureName(String newFeatureName)
  {
    featureField = newFeatureName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void unsetFeatureName()
  {
    setFeatureName(null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public boolean isSetFeatureName()
  {
    return featureField != null && eContainer() instanceof EObjectToChangesMapEntryImpl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String getDataValue()
  {
    return 
      valueField instanceof String ?
        (String)valueField :
        null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void setDataValue(String newDataValue)
  {
    String oldDataValue = getDataValue();
    valueField = newDataValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChangePackage.FEATURE_CHANGE__DATA_VALUE, oldDataValue, newDataValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSet()
  {
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSet(boolean newSet)
  {
    boolean oldSet = set;
    set = newSet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChangePackage.FEATURE_CHANGE__SET, oldSet, set));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EStructuralFeature getFeature()
  {
    EStructuralFeature feature;
    if (featureField instanceof String)
    {
      if (eContainer() instanceof EObjectToChangesMapEntryImpl)
      {
        featureField = feature = ((EObject)((Map.Entry)eContainer()).getKey()).eClass().getEStructuralFeature((String)featureField);
      }
      else
      {
        feature = null;
      }
    }
    else
    {
      feature = (EStructuralFeature)featureField;
      if (feature != null && feature.eIsProxy())
      {
        EStructuralFeature oldFeature = feature;
        feature = (EStructuralFeature)EcoreUtil.resolve(feature, this);
        if (feature != oldFeature)
        {
          if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChangePackage.FEATURE_CHANGE__FEATURE, oldFeature, feature));
        }
      }
    }
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EStructuralFeature basicGetFeature()
  {
    if (featureField instanceof EStructuralFeature)
    {
      return (EStructuralFeature)featureField;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void setFeature(EStructuralFeature newFeature)
  {
    EStructuralFeature oldFeature = basicGetFeature();
    featureField = newFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChangePackage.FEATURE_CHANGE__FEATURE, oldFeature, newFeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void unsetFeature()
  {
    setFeature(null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public boolean isSetFeature()
  {
    return featureField instanceof EStructuralFeature && !(eContainer() instanceof EObjectToChangesMapEntryImpl);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EObject getReferenceValue()
  {
    EObject referenceValue = basicGetReferenceValue();
    if (referenceValue != null && referenceValue.eIsProxy())
    {
      EObject oldReferenceValue = referenceValue;
      referenceValue = EcoreUtil.resolve(referenceValue, this);
      if (referenceValue != oldReferenceValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChangePackage.FEATURE_CHANGE__REFERENCE_VALUE, oldReferenceValue, referenceValue));
      }
    }
    return referenceValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EObject basicGetReferenceValue()
  {
    return 
      valueField instanceof EObject ?
        (EObject)valueField :
        null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void setReferenceValue(EObject newReferenceValue)
  {
    EObject oldReferenceValue = basicGetReferenceValue();
    valueField = newReferenceValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChangePackage.FEATURE_CHANGE__REFERENCE_VALUE, oldReferenceValue, newReferenceValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getListChanges()
  {
    if (listChanges == null)
    {
      listChanges = new EObjectContainmentEList(ListChange.class, this, ChangePackage.FEATURE_CHANGE__LIST_CHANGES);
    }
    return listChanges;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Object getValue()
  {
    EStructuralFeature feature = getFeature();
    if (feature.isMany())
    {
      if (valueField == null && eContainer() instanceof EObjectToChangesMapEntryImpl)
      {
        valueField = getListValue((EList)((EObject)((Map.Entry)eContainer()).getKey()).eGet(feature));
      }
      return valueField;
    }
    else
    {
      if (feature instanceof EAttribute)
      {
        EDataType type = (EDataType)feature.getEType();
        return EcoreUtil.createFromString(type, getDataValue());
      }
      else
      {
        return getReferenceValue();
      }
    }
  }

  protected void setValue(Object value)
  {
    EStructuralFeature feature = getFeature();
    if (feature.isMany())
    {
      valueField = value;
    }
    else
    {
      if (feature instanceof EAttribute)
      {
        EDataType type = (EDataType)feature.getEType();
        setDataValue(EcoreUtil.convertToString(type, value));
      }
      else
      {
        setReferenceValue((EObject)value);
      }
    }
  }

  protected EList getListValue(EList originalList)
  {
    if (isSet() && getFeature().isMany())
    {
      if (valueField instanceof EList) // cached already?
      {
        return (EList)valueField;
      }
      EList changedList = new BasicEList(originalList);
      apply(changedList);
      valueField = changedList; // cache result
      return changedList;
    }
    return ECollections.EMPTY_ELIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void apply(EObject originalObject)
  {
    EStructuralFeature feature = getFeature();
    if (feature != null)
    {
      if (!isSet())
      {
        originalObject.eUnset(feature);
      }
      else if (feature.isMany())
      {
        if (listChanges != null)
        {
          if (feature instanceof EReference && ((EReference)feature).getEOpposite() != null)
          {
            // Bi-directional references need to use this less efficient approach because some
            //  or all of the changes may already have been made from the other end.
            //
            EcoreUtil.setEList((EList)originalObject.eGet(feature), (EList)getValue());
          }
          else
          {
            apply((EList)originalObject.eGet(feature));
          }
        }
      }
      else
      {
        originalObject.eSet(feature, getValue());
      }
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void applyAndReverse(EObject originalObject)
  {
    EStructuralFeature feature = getFeature();
    if (feature != null)
    {
      boolean newIsSet = originalObject.eIsSet(feature);
      Object newValue = feature.isMany() ? null : originalObject.eGet(feature);

      if (!isSet())
      {
        if (feature.isMany())
        {
          ListChange listChange = ChangeFactory.eINSTANCE.createListChange();
          listChange.setKind(ChangeKind.ADD_LITERAL);
          listChange.setIndex(0);
          listChange.getValues().addAll((EList)originalObject.eGet(feature));
          getListChanges().add(listChange);
        }
        originalObject.eUnset(feature);
      }
      else if (feature.isMany())
      {
        if (listChanges != null)
        {
          if (feature instanceof EReference && ((EReference)feature).getEOpposite() != null)
          {
            // Bi-directional references need to use this less efficient approach because some
            //  or all of the changes may already have been made from the other end.
            //
            EcoreUtil.setEList((EList)originalObject.eGet(feature), (EList)getValue());
          }
          else
          {
            EList applyToList = (EList)originalObject.eGet(feature);
            for (Iterator iter = getListChanges().iterator(); iter.hasNext(); )
            {
              ListChange listChange = (ListChange)iter.next();
              listChange.applyAndReverse(applyToList);
            }
          }
          ECollections.reverse(getListChanges());
        }
      }
      else
      {
        originalObject.eSet(feature, getValue());
      }

      setSet(newIsSet);
      setValue(newValue);
    }
  }

  protected void apply(EList toList)
  {
    for (Iterator iter = getListChanges().iterator(); iter.hasNext(); )
    {
      ListChange listChange = (ListChange)iter.next();
      listChange.apply(toList);
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs)
  {
    if (featureID >= 0)
    {
      switch (eDerivedStructuralFeatureID(featureID, baseClass))
      {
        case ChangePackage.FEATURE_CHANGE__LIST_CHANGES:
          return ((InternalEList)getListChanges()).basicRemove(otherEnd, msgs);
        default:
          return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
      }
    }
    return eBasicSetContainer(null, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(EStructuralFeature eFeature, boolean resolve)
  {
    switch (eDerivedStructuralFeatureID(eFeature))
    {
      case ChangePackage.FEATURE_CHANGE__FEATURE_NAME:
        return getFeatureName();
      case ChangePackage.FEATURE_CHANGE__DATA_VALUE:
        return getDataValue();
      case ChangePackage.FEATURE_CHANGE__SET:
        return isSet() ? Boolean.TRUE : Boolean.FALSE;
      case ChangePackage.FEATURE_CHANGE__VALUE:
        return getValue();
      case ChangePackage.FEATURE_CHANGE__FEATURE:
        if (resolve) return getFeature();
        return basicGetFeature();
      case ChangePackage.FEATURE_CHANGE__REFERENCE_VALUE:
        if (resolve) return getReferenceValue();
        return basicGetReferenceValue();
      case ChangePackage.FEATURE_CHANGE__LIST_CHANGES:
        return getListChanges();
    }
    return eDynamicGet(eFeature, resolve);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eSet(EStructuralFeature eFeature, Object newValue)
  {
    switch (eDerivedStructuralFeatureID(eFeature))
    {
      case ChangePackage.FEATURE_CHANGE__FEATURE_NAME:
        setFeatureName((String)newValue);
        return;
      case ChangePackage.FEATURE_CHANGE__DATA_VALUE:
        setDataValue((String)newValue);
        return;
      case ChangePackage.FEATURE_CHANGE__SET:
        setSet(((Boolean)newValue).booleanValue());
        return;
      case ChangePackage.FEATURE_CHANGE__FEATURE:
        setFeature((EStructuralFeature)newValue);
        return;
      case ChangePackage.FEATURE_CHANGE__REFERENCE_VALUE:
        setReferenceValue((EObject)newValue);
        return;
      case ChangePackage.FEATURE_CHANGE__LIST_CHANGES:
        getListChanges().clear();
        getListChanges().addAll((Collection)newValue);
        return;
    }
    eDynamicSet(eFeature, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eUnset(EStructuralFeature eFeature)
  {
    switch (eDerivedStructuralFeatureID(eFeature))
    {
      case ChangePackage.FEATURE_CHANGE__FEATURE_NAME:
        unsetFeatureName();
        return;
      case ChangePackage.FEATURE_CHANGE__DATA_VALUE:
        setDataValue((String)null);
        return;
      case ChangePackage.FEATURE_CHANGE__SET:
        setSet(SET_EDEFAULT);
        return;
      case ChangePackage.FEATURE_CHANGE__FEATURE:
        unsetFeature();
        return;
      case ChangePackage.FEATURE_CHANGE__REFERENCE_VALUE:
        setReferenceValue((EObject)null);
        return;
      case ChangePackage.FEATURE_CHANGE__LIST_CHANGES:
        getListChanges().clear();
        return;
    }
    eDynamicUnset(eFeature);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean eIsSet(EStructuralFeature eFeature)
  {
    switch (eDerivedStructuralFeatureID(eFeature))
    {
      case ChangePackage.FEATURE_CHANGE__FEATURE_NAME:
        return isSetFeatureName();
      case ChangePackage.FEATURE_CHANGE__DATA_VALUE:
        return getDataValue() != null;
      case ChangePackage.FEATURE_CHANGE__SET:
        return set != SET_EDEFAULT;
      case ChangePackage.FEATURE_CHANGE__VALUE:
        return getValue() != null;
      case ChangePackage.FEATURE_CHANGE__FEATURE:
        return isSetFeature();
      case ChangePackage.FEATURE_CHANGE__REFERENCE_VALUE:
        return basicGetReferenceValue() != null;
      case ChangePackage.FEATURE_CHANGE__LIST_CHANGES:
        return listChanges != null && !listChanges.isEmpty();
    }
    return eDynamicIsSet(eFeature);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (set: ");
    result.append(set);
    result.append(')');
    return result.toString();
  }

} //FeatureChangeImpl
