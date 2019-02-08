package com.sigma.niceswitch;

import androidx.annotation.Keep;

@Keep
public class Constants {
    public static final long SWITCHER_ANIMATION_DURATION = 800L;
    public static final long COLOR_ANIMATION_DURATION = 300L;
    public static final long TRANSLATE_ANIMATION_DURATION = 200L;
    public static final float ON_CLICK_RADIUS_OFFSET = 2f;
    public static final float BOUNCE_ANIM_AMPLITUDE_IN = 0.2f;
    public static final float BOUNCE_ANIM_AMPLITUDE_OUT = 0.15f;
    public static final float BOUNCE_ANIM_FREQUENCY_IN = 14.5f;
    public static final float BOUNCE_ANIM_FREQUENCY_OUT = 12.0f;

    public static final String STATE = "switch_state";
    public static final String KEY_CHECKED = "checked";
}
