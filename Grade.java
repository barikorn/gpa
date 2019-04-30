package gpa;

/***
 * This is the enumeration for the grades which allows for easy
 * math conversion.
 * @author Leziga Barikor
 * @version April 29, 2019
 */
public enum Grade {
    A(4.00f), A_MIN(3.70f), B_PLUS(3.33f), B(3.00f), B_MIN(2.70f),
    C_PLUS(2.30f), C(2.00f), C_MIN(1.70f), D_PLUS(1.30f), D(1.00f),
    D_MIN(0.70f), WF(0.00f), F(0.00f);

    private float namVal;

    Grade(float numVal){
        this.namVal = numVal;
    }

    public float getNamVal(){
        return namVal;
    }
}
