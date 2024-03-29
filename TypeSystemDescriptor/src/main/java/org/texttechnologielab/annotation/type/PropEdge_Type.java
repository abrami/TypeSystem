
/* First created by JCasGen Fri Jul 20 13:34:22 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/**
 * Updated by JCasGen Fri Jul 20 13:34:22 CEST 2018
 *
 * @generated
 */
public class PropEdge_Type extends Edge_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = PropEdge.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologielab.annotation.type.PropEdge");

    /**
     * @generated
     */
    final Feature casFeat_mode;
    /**
     * @generated
     */
    final int casFeatCode_mode;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getMode(int addr) {
        if (featOkTst && casFeat_mode == null)
            jcas.throwFeatMissing("mode", "org.texttechnologielab.annotation.type.PropEdge");
        return ll_cas.ll_getStringValue(addr, casFeatCode_mode);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setMode(int addr, String v) {
        if (featOkTst && casFeat_mode == null)
            jcas.throwFeatMissing("mode", "org.texttechnologielab.annotation.type.PropEdge");
        ll_cas.ll_setStringValue(addr, casFeatCode_mode, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_graphSource;
    /**
     * @generated
     */
    final int casFeatCode_graphSource;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getGraphSource(int addr) {
        if (featOkTst && casFeat_graphSource == null)
            jcas.throwFeatMissing("graphSource", "org.texttechnologielab.annotation.type.PropEdge");
        return ll_cas.ll_getStringValue(addr, casFeatCode_graphSource);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setGraphSource(int addr, String v) {
        if (featOkTst && casFeat_graphSource == null)
            jcas.throwFeatMissing("graphSource", "org.texttechnologielab.annotation.type.PropEdge");
        ll_cas.ll_setStringValue(addr, casFeatCode_graphSource, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_graphTarget;
    /**
     * @generated
     */
    final int casFeatCode_graphTarget;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getGraphTarget(int addr) {
        if (featOkTst && casFeat_graphTarget == null)
            jcas.throwFeatMissing("graphTarget", "org.texttechnologielab.annotation.type.PropEdge");
        return ll_cas.ll_getStringValue(addr, casFeatCode_graphTarget);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setGraphTarget(int addr, String v) {
        if (featOkTst && casFeat_graphTarget == null)
            jcas.throwFeatMissing("graphTarget", "org.texttechnologielab.annotation.type.PropEdge");
        ll_cas.ll_setStringValue(addr, casFeatCode_graphTarget, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public PropEdge_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_mode = jcas.getRequiredFeatureDE(casType, "mode", "uima.cas.String", featOkTst);
        casFeatCode_mode = (null == casFeat_mode) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_mode).getCode();


        casFeat_graphSource = jcas.getRequiredFeatureDE(casType, "graphSource", "uima.cas.String", featOkTst);
        casFeatCode_graphSource = (null == casFeat_graphSource) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_graphSource).getCode();


        casFeat_graphTarget = jcas.getRequiredFeatureDE(casType, "graphTarget", "uima.cas.String", featOkTst);
        casFeatCode_graphTarget = (null == casFeat_graphTarget) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_graphTarget).getCode();

    }
}



    