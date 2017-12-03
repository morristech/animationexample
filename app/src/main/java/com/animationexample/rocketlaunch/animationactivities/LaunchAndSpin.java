/*
 * Copyright 2017 Nazmul Idris. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.animationexample.rocketlaunch.animationactivities;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;

public class LaunchAndSpin extends BaseAnimationActivity {
    @Override
    protected void onStartAnimation() {

        ObjectAnimator positionAnimator =
                ObjectAnimator.ofFloat(mRocket, "translationY", 0, -mScreenHeight);

        ObjectAnimator rotationAnimator = ObjectAnimator.ofFloat(mRocket, "rotation", 0f, 180f);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(positionAnimator).with(rotationAnimator);
        animatorSet.setDuration(DEFAULT_ANIMATION_DURATION);
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        animatorSet.start();
    }

    @Override
    protected String getDisplayMessage() {
        return "AnimatorSet, and two ObjectAnimators";
    }
}
