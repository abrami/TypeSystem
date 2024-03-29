
/* First created by JCasGen Wed Aug 28 09:38:42 CEST 2019 */
package org.texttechnologylab.annotation.node.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologielab.annotation.type.Node_Type;

/**
 * Updated by JCasGen Wed Aug 28 09:38:42 CEST 2019
 *
 * @generated
 */
public class RelationContext_Type extends Node_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = RelationContext.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.node.type.RelationContext");

    /**
     * @generated
     */
    final Feature casFeat_relatesTo;
    /**
     * @generated
     */
    final int casFeatCode_relatesTo;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getRelatesTo(int addr) {
        if (featOkTst && casFeat_relatesTo == null)
            jcas.throwFeatMissing("relatesTo", "org.texttechnologylab.annotation.node.type.RelationContext");
        return ll_cas.ll_getStringValue(addr, casFeatCode_relatesTo);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setRelatesTo(int addr, String v) {
        if (featOkTst && casFeat_relatesTo == null)
            jcas.throwFeatMissing("relatesTo", "org.texttechnologylab.annotation.node.type.RelationContext");
        ll_cas.ll_setStringValue(addr, casFeatCode_relatesTo, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_ReferencedID;
    /**
     * @generated
     */
    final int casFeatCode_ReferencedID;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getReferencedID(int addr) {
        if (featOkTst && casFeat_ReferencedID == null)
            jcas.throwFeatMissing("ReferencedID", "org.texttechnologylab.annotation.node.type.RelationContext");
        return ll_cas.ll_getIntValue(addr, casFeatCode_ReferencedID);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setReferencedID(int addr, int v) {
        if (featOkTst && casFeat_ReferencedID == null)
            jcas.throwFeatMissing("ReferencedID", "org.texttechnologylab.annotation.node.type.RelationContext");
        ll_cas.ll_setIntValue(addr, casFeatCode_ReferencedID, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_displayName;
    /**
     * @generated
     */
    final int casFeatCode_displayName;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getDisplayName(int addr) {
        if (featOkTst && casFeat_displayName == null)
            jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.RelationContext");
        return ll_cas.ll_getStringValue(addr, casFeatCode_displayName);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setDisplayName(int addr, String v) {
        if (featOkTst && casFeat_displayName == null)
            jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.RelationContext");
        ll_cas.ll_setStringValue(addr, casFeatCode_displayName, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_wikiDataID;
    /**
     * @generated
     */
    final int casFeatCode_wikiDataID;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getWikiDataID(int addr) {
        if (featOkTst && casFeat_wikiDataID == null)
            jcas.throwFeatMissing("wikiDataID", "org.texttechnologylab.annotation.node.type.RelationContext");
        return ll_cas.ll_getStringValue(addr, casFeatCode_wikiDataID);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setWikiDataID(int addr, String v) {
        if (featOkTst && casFeat_wikiDataID == null)
            jcas.throwFeatMissing("wikiDataID", "org.texttechnologylab.annotation.node.type.RelationContext");
        ll_cas.ll_setStringValue(addr, casFeatCode_wikiDataID, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public RelationContext_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_relatesTo = jcas.getRequiredFeatureDE(casType, "relatesTo", "uima.cas.String", featOkTst);
        casFeatCode_relatesTo = (null == casFeat_relatesTo) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_relatesTo).getCode();


        casFeat_ReferencedID = jcas.getRequiredFeatureDE(casType, "ReferencedID", "uima.cas.Integer", featOkTst);
        casFeatCode_ReferencedID = (null == casFeat_ReferencedID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_ReferencedID).getCode();


        casFeat_displayName = jcas.getRequiredFeatureDE(casType, "displayName", "uima.cas.String", featOkTst);
        casFeatCode_displayName = (null == casFeat_displayName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_displayName).getCode();


        casFeat_wikiDataID = jcas.getRequiredFeatureDE(casType, "wikiDataID", "uima.cas.String", featOkTst);
        casFeatCode_wikiDataID = (null == casFeat_wikiDataID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_wikiDataID).getCode();

    }
}



    