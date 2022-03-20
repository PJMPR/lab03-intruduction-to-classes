package org.pjatk.products.specs;


import org.junit.jupiter.api.Test;
import org.pjatk.products.Product;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ThreeForTwoDiscountTest extends DiscountBase {

    @Test
    public void it_should_properly_set_new_price_to_0_test(){
        calculator.threeForPriceOfTwo();
        assertThat(p3.price, is(0.0));
    }
}
