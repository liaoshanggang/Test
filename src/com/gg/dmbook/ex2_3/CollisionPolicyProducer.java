package com.gg.dmbook.ex2_3;







public class CollisionPolicyProducer implements PolicyProducer
{
    public AutoInsurance getPolicyObj() //Fruit factory()
    {
        return new CollisionCoverage();
    }
}
