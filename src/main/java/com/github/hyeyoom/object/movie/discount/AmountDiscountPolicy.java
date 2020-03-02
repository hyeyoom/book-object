package com.github.hyeyoom.object.movie.discount;

import com.github.hyeyoom.object.movie.currency.Money;
import com.github.hyeyoom.object.movie.screen.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {

    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
