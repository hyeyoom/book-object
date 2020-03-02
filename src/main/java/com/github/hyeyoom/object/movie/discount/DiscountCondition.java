package com.github.hyeyoom.object.movie.discount;

import com.github.hyeyoom.object.movie.screen.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
