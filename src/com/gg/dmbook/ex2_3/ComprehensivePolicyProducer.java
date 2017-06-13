package com.gg.dmbook.ex2_3;






public class ComprehensivePolicyProducer implements PolicyProducer
{
    public AutoInsurance getPolicyObj() //Fruit factory()
    {
        return new ComprehensiveCoverage();
    }
}
