
/* First created by JCasGen Wed Aug 28 09:38:42 CEST 2019 */
package org.texttechnologylab.annotation.context.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.node.type.Context_Type;

/**
 * Updated by JCasGen Wed Aug 28 09:38:42 CEST 2019
 *
 * @generated
 */
public class PersonContext_Type extends Context_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = PersonContext.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.context.type.PersonContext");

    /**
     * @generated
     */
    final Feature casFeat_birthDate;
    /**
     * @generated
     */
    final int casFeatCode_birthDate;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getBirthDate(int addr) {
        if (featOkTst && casFeat_birthDate == null)
            jcas.throwFeatMissing("birthDate", "org.texttechnologylab.annotation.context.type.PersonContext");
        return ll_cas.ll_getStringValue(addr, casFeatCode_birthDate);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setBirthDate(int addr, String v) {
        if (featOkTst && casFeat_birthDate == null)
            jcas.throwFeatMissing("birthDate", "org.texttechnologylab.annotation.context.type.PersonContext");
        ll_cas.ll_setStringValue(addr, casFeatCode_birthDate, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_Name;
    /**
     * @generated
     */
    final int casFeatCode_Name;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getName(int addr) {
        if (featOkTst && casFeat_Name == null)
            jcas.throwFeatMissing("Name", "org.texttechnologylab.annotation.context.type.PersonContext");
        return ll_cas.ll_getStringValue(addr, casFeatCode_Name);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setName(int addr, String v) {
        if (featOkTst && casFeat_Name == null)
            jcas.throwFeatMissing("Name", "org.texttechnologylab.annotation.context.type.PersonContext");
        ll_cas.ll_setStringValue(addr, casFeatCode_Name, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_contextInf;
    /**
     * @generated
     */
    final int casFeatCode_contextInf;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getContextInf(int addr) {
        if (featOkTst && casFeat_contextInf == null)
            jcas.throwFeatMissing("contextInf", "org.texttechnologylab.annotation.context.type.PersonContext");
        return ll_cas.ll_getStringValue(addr, casFeatCode_contextInf);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setContextInf(int addr, String v) {
        if (featOkTst && casFeat_contextInf == null)
            jcas.throwFeatMissing("contextInf", "org.texttechnologylab.annotation.context.type.PersonContext");
        ll_cas.ll_setStringValue(addr, casFeatCode_contextInf, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_gender;
    /**
     * @generated
     */
    final int casFeatCode_gender;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getGender(int addr) {
        if (featOkTst && casFeat_gender == null)
            jcas.throwFeatMissing("gender", "org.texttechnologylab.annotation.context.type.PersonContext");
        return ll_cas.ll_getStringValue(addr, casFeatCode_gender);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setGender(int addr, String v) {
        if (featOkTst && casFeat_gender == null)
            jcas.throwFeatMissing("gender", "org.texttechnologylab.annotation.context.type.PersonContext");
        ll_cas.ll_setStringValue(addr, casFeatCode_gender, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_birthPlace;
    /**
     * @generated
     */
    final int casFeatCode_birthPlace;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getBirthPlace(int addr) {
        if (featOkTst && casFeat_birthPlace == null)
            jcas.throwFeatMissing("birthPlace", "org.texttechnologylab.annotation.context.type.PersonContext");
        return ll_cas.ll_getStringValue(addr, casFeatCode_birthPlace);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setBirthPlace(int addr, String v) {
        if (featOkTst && casFeat_birthPlace == null)
            jcas.throwFeatMissing("birthPlace", "org.texttechnologylab.annotation.context.type.PersonContext");
        ll_cas.ll_setStringValue(addr, casFeatCode_birthPlace, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_fieldOfWork;
    /**
     * @generated
     */
    final int casFeatCode_fieldOfWork;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getFieldOfWork(int addr) {
        if (featOkTst && casFeat_fieldOfWork == null)
            jcas.throwFeatMissing("fieldOfWork", "org.texttechnologylab.annotation.context.type.PersonContext");
        return ll_cas.ll_getStringValue(addr, casFeatCode_fieldOfWork);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setFieldOfWork(int addr, String v) {
        if (featOkTst && casFeat_fieldOfWork == null)
            jcas.throwFeatMissing("fieldOfWork", "org.texttechnologylab.annotation.context.type.PersonContext");
        ll_cas.ll_setStringValue(addr, casFeatCode_fieldOfWork, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public PersonContext_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_birthDate = jcas.getRequiredFeatureDE(casType, "birthDate", "uima.cas.String", featOkTst);
        casFeatCode_birthDate = (null == casFeat_birthDate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_birthDate).getCode();


        casFeat_Name = jcas.getRequiredFeatureDE(casType, "Name", "uima.cas.String", featOkTst);
        casFeatCode_Name = (null == casFeat_Name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_Name).getCode();


        casFeat_contextInf = jcas.getRequiredFeatureDE(casType, "contextInf", "uima.cas.String", featOkTst);
        casFeatCode_contextInf = (null == casFeat_contextInf) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_contextInf).getCode();


        casFeat_gender = jcas.getRequiredFeatureDE(casType, "gender", "uima.cas.String", featOkTst);
        casFeatCode_gender = (null == casFeat_gender) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_gender).getCode();


        casFeat_birthPlace = jcas.getRequiredFeatureDE(casType, "birthPlace", "uima.cas.String", featOkTst);
        casFeatCode_birthPlace = (null == casFeat_birthPlace) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_birthPlace).getCode();


        casFeat_fieldOfWork = jcas.getRequiredFeatureDE(casType, "fieldOfWork", "uima.cas.String", featOkTst);
        casFeatCode_fieldOfWork = (null == casFeat_fieldOfWork) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_fieldOfWork).getCode();

    }
}



    