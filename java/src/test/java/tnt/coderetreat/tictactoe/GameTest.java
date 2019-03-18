package tnt.coderetreat.tictactoe;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static tnt.coderetreat.tictactoe.SYMBOL.O;
import static tnt.coderetreat.tictactoe.SYMBOL.X;

/**
 * @author zen
 * @since 2019/03/11
 */
public class GameTest {

    @Test
    public void test_1D_array_equal() throws Exception {
        // WHEN
        SYMBOL[] arr = new SYMBOL[] {X, O, null, O, X};
        arr[2] = X;
        // THEN
        assertThat(arr).isEqualTo(new SYMBOL[] {X, O, X, O, X});
    }

    @Test
    public void test_2D_array_equal() throws Exception {
        // WHEN
        SYMBOL[][] arr = new SYMBOL[][] {new SYMBOL[] {X, O, null}, new SYMBOL[] {null, O, X}};
        arr[0][2] = O;
        // THEN
        assertThat(arr).isEqualTo(new SYMBOL[][] {new SYMBOL[] {X, O, O}, new SYMBOL[] {null, O, X}});

        assertThat(arr).isEqualTo(new SYMBOL[][] {new SYMBOL[] {X, O, X}, new SYMBOL[] {null, O, X}});
    }

}
