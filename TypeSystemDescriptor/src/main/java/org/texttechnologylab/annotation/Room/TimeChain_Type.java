
/* First created by JCasGen Thu Aug 15 14:47:15 CEST 2019 */
package org.texttechnologylab.annotation.Room;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/**
 * A link in the time chain
 * Updated by JCasGen Thu Aug 15 14:47:15 CEST 2019
 *
 * @generated
 */
public class TimeChain_Type extends AnnotationBase_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = TimeChain.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Room.TimeChain");

    /**
     * @generated
     */
    final Feature casFeat_next;
    /**
     * @generated
     */
    final int casFeatCode_next;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getNext(int addr) {
        if (featOkTst && casFeat_next == null)
            jcas.throwFeatMissing("next", "org.texttechnologylab.annotation.Room.TimeChain");
        return ll_cas.ll_getRefValue(addr, casFeatCode_next);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setNext(int addr, int v) {
        if (featOkTst && casFeat_next == null)
            jcas.throwFeatMissing("next", "org.texttechnologylab.annotation.Room.TimeChain");
        ll_cas.ll_setRefValue(addr, casFeatCode_next, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_prev;
    /**
     * @generated
     */
    final int casFeatCode_prev;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getPrev(int addr) {
        if (featOkTst && casFeat_prev == null)
            jcas.throwFeatMissing("prev", "org.texttechnologylab.annotation.Room.TimeChain");
        return ll_cas.ll_getRefValue(addr, casFeatCode_prev);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setPrev(int addr, int v) {
        if (featOkTst && casFeat_prev == null)
            jcas.throwFeatMissing("prev", "org.texttechnologylab.annotation.Room.TimeChain");
        ll_cas.ll_setRefValue(addr, casFeatCode_prev, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public TimeChain_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_next = jcas.getRequiredFeatureDE(casType, "next", "org.texttechnologylab.annotation.Room.TimeChain", featOkTst);
        casFeatCode_next = (null == casFeat_next) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_next).getCode();


        casFeat_prev = jcas.getRequiredFeatureDE(casType, "prev", "org.texttechnologylab.annotation.Room.TimeChain", featOkTst);
        casFeatCode_prev = (null == casFeat_prev) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_prev).getCode();

    }
}



    