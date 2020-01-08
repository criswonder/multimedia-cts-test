package cookbook.test_mux_encode;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import androidx.test.filters.LargeTest;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

@LargeTest
public class OperationHintInstrumentationTest
        extends ActivityInstrumentationTestCase2<MainActivity> {
    private String TAG = "OperationHintInstrumentationTest";
    private boolean VERBOSE = true;
    private MainActivity mActivity;


    public OperationHintInstrumentationTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        // Espresso does not start the Activity for you we need to do this manually here.
        mActivity = getActivity();
    }

    public void testPreconditions() {
        assert mActivity != null;
        if(VERBOSE) Log.e(TAG,"testPreconditions ");
    }

    public void testEditText_OperandOneHint() {
    }

    public void testEditText_OperandTwoHint() {
    }

}
