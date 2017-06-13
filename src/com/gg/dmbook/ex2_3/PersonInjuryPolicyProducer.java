package com.gg.dmbook.ex2_3;






public class PersonInjuryPolicyProducer implements PolicyProducer
{
    public AutoInsurance getPolicyObj() //Fruit factory()
    {
        return new PersonalInjuryProtection();
    }
}
