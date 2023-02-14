package org.springframework.context.testfixture.beans;

/**
 * @author charles tao
 * @date 2023/2/9 - 12:15
 */
public class TestBeanInject {

    private String propA;
    private String propB;


    public TestBeanInject(String propA, String propB) {
        this.propA = propA;
        this.propB = propB;
    }

    public TestBeanInject() {
    }

    public String getPropA() {
        return propA;
    }

    public void setPropA(String propA) {
        this.propA = propA;
    }

    public String getPropB() {
        return propB;
    }

    public void setPropB(String propB) {
        this.propB = propB;
    }
}
