

/* First created by JCasGen Fri Jun 21 09:34:41 CEST 2019 */
package de.tudarmstadt.ukp.dkpro.core.api.anomaly.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Fri Jul 12 15:48:41 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/TextAnnotator2/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 *
 * @generated
 */
public class Anomaly extends Annotation {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Anomaly.class);
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int type = typeIndexID;

    /**
     * @return index of the type
     * @generated
     */
    @Override
    public int getTypeIndexID() {
        return typeIndexID;
    }

    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    protected Anomaly() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public Anomaly(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Anomaly(JCas jcas) {
        super(jcas);
        readObject();
    }

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public Anomaly(JCas jcas, int begin, int end) {
        super(jcas);
        setBegin(begin);
        setEnd(end);
        readObject();
    }

    /**
     * <!-- begin-user-doc -->
     * Write your own initialization here
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    private void readObject() {/*default - does nothing empty block */}


    //*--------------*
    //* Feature: description

    /**
     * getter for description - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getDescription() {
        if (Anomaly_Type.featOkTst && ((Anomaly_Type) jcasType).casFeat_description == null)
            jcasType.jcas.throwFeatMissing("description", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly");
        return jcasType.ll_cas.ll_getStringValue(addr, ((Anomaly_Type) jcasType).casFeatCode_description);
    }

    /**
     * setter for description - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setDescription(String v) {
        if (Anomaly_Type.featOkTst && ((Anomaly_Type) jcasType).casFeat_description == null)
            jcasType.jcas.throwFeatMissing("description", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly");
        jcasType.ll_cas.ll_setStringValue(addr, ((Anomaly_Type) jcasType).casFeatCode_description, v);
    }


    //*--------------*
    //* Feature: suggestions

    /**
     * getter for suggestions - gets An array of the suggested actions to be taken for this anomaly.
     *
     * @return value of the feature
     * @generated
     */
    public FSArray getSuggestions() {
        if (Anomaly_Type.featOkTst && ((Anomaly_Type) jcasType).casFeat_suggestions == null)
            jcasType.jcas.throwFeatMissing("suggestions", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly");
        return (FSArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Anomaly_Type) jcasType).casFeatCode_suggestions)));
    }

    /**
     * setter for suggestions - sets An array of the suggested actions to be taken for this anomaly.
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setSuggestions(FSArray v) {
        if (Anomaly_Type.featOkTst && ((Anomaly_Type) jcasType).casFeat_suggestions == null)
            jcasType.jcas.throwFeatMissing("suggestions", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly");
        jcasType.ll_cas.ll_setRefValue(addr, ((Anomaly_Type) jcasType).casFeatCode_suggestions, jcasType.ll_cas.ll_getFSRef(v));
    }

    /**
     * indexed getter for suggestions - gets an indexed value - An array of the suggested actions to be taken for this anomaly.
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    public SuggestedAction getSuggestions(int i) {
        if (Anomaly_Type.featOkTst && ((Anomaly_Type) jcasType).casFeat_suggestions == null)
            jcasType.jcas.throwFeatMissing("suggestions", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Anomaly_Type) jcasType).casFeatCode_suggestions), i);
        return (SuggestedAction) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Anomaly_Type) jcasType).casFeatCode_suggestions), i)));
    }

    /**
     * indexed setter for suggestions - sets an indexed value - An array of the suggested actions to be taken for this anomaly.
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    public void setSuggestions(int i, SuggestedAction v) {
        if (Anomaly_Type.featOkTst && ((Anomaly_Type) jcasType).casFeat_suggestions == null)
            jcasType.jcas.throwFeatMissing("suggestions", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Anomaly_Type) jcasType).casFeatCode_suggestions), i);
        jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Anomaly_Type) jcasType).casFeatCode_suggestions), i, jcasType.ll_cas.ll_getFSRef(v));
    }


    //*--------------*
    //* Feature: category

    /**
     * getter for category - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getCategory() {
        if (Anomaly_Type.featOkTst && ((Anomaly_Type) jcasType).casFeat_category == null)
            jcasType.jcas.throwFeatMissing("category", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly");
        return jcasType.ll_cas.ll_getStringValue(addr, ((Anomaly_Type) jcasType).casFeatCode_category);
    }

    /**
     * setter for category - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setCategory(String v) {
        if (Anomaly_Type.featOkTst && ((Anomaly_Type) jcasType).casFeat_category == null)
            jcasType.jcas.throwFeatMissing("category", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly");
        jcasType.ll_cas.ll_setStringValue(addr, ((Anomaly_Type) jcasType).casFeatCode_category, v);
    }
}

    