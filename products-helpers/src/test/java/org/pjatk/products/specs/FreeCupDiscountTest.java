package org.pjatk.products.specs;

import org.junit.jupiter.api.Test;
import org.pjatk.products.Product;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FreeCupDiscountTest extends DiscountBase {

    @Test
    public void do_nothing_when_price_is_to_low_test(){
        calculator.addFreeCompanyGlass(10000.0);
        assertThat(products, hasSize(4));
    }

    @Test
    public void add_free_company_glass_test(){
        calculator.addFreeCompanyGlass(10000.0);
        assertThat(products, hasSize(5));
    }
}
