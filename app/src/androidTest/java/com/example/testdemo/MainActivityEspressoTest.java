package com.example.testdemo;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
public class MainActivityEspressoTest {

    /*
    This rule provides functional testing of a single activity.
    The activity under test is launched before each test annotated with @Test and
    before any method annotated with @Before. It's terminated after the test is
    completed and all methods annotated with @After are finished. To access the
    activity under test in your test logic, provide a callback runnable to
    ActivityScenarioRule.getScenario().onActivity().
     */
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule(MainActivity.class);

    @Before
    public void setup() {
        onView(withId(R.id.editText))
                .perform(typeText("2"), closeSoftKeyboard());
    }

    @Test
    public void changeTextFirst() {
// Type text and then press the button.
        onView(withId(R.id.calcButton)).perform(click());

// Check that the text was changed to the correct value
        onView(withId(R.id.editText)).check(matches(withText("4")));
    }
}
