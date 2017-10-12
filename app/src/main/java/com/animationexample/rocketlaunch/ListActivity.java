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

package com.animationexample.rocketlaunch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.animationexample.rocketlaunch.animationactivities.AccelerateRocketAnimationActivity;
import com.animationexample.rocketlaunch.animationactivities.ColorAnimationActivity;
import com.animationexample.rocketlaunch.animationactivities.FlyThereAndBackAnimationActivity;
import com.animationexample.rocketlaunch.animationactivities.FlyWithDogeAnimationActivity;
import com.animationexample.rocketlaunch.animationactivities.LaunchRocketValueAnimatorAnimationActivity;
import com.animationexample.rocketlaunch.animationactivities.LaunchAndSpinAnimatorSetAnimatorActivity;
import com.animationexample.rocketlaunch.animationactivities.LaunchAndSpinViewPropertyAnimatorAnimationActivity;
import com.animationexample.rocketlaunch.animationactivities.LaunchRocketObjectAnimatorAnimationActivity;
import com.animationexample.rocketlaunch.animationactivities.RotateRocketAnimationActivity;
import com.animationexample.rocketlaunch.animationactivities.NoAnimationActivity;
import com.animationexample.rocketlaunch.animationactivities.WithListenerAnimationActivity;
import com.animationexample.rocketlaunch.animationactivities.XmlAnimationActivity;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));

    List<RocketAnimationItem> items = new ArrayList<>();

    items.add(new RocketAnimationItem(getString(R.string.title_no_animation),
        new Intent(this, NoAnimationActivity.class)));

    items.add(new RocketAnimationItem(getString(R.string.title_launch_rocket),
        new Intent(this, LaunchRocketValueAnimatorAnimationActivity.class)));

    items.add(new RocketAnimationItem(getString(R.string.title_spin_rocket),
        new Intent(this, RotateRocketAnimationActivity.class)));

    items.add(new RocketAnimationItem(getString(R.string.title_accelerate_rocket),
        new Intent(this, AccelerateRocketAnimationActivity.class)));

    items.add(new RocketAnimationItem(getString(R.string.title_launch_rocket_objectanimator),
        new Intent(this, LaunchRocketObjectAnimatorAnimationActivity.class)));

    items.add(new RocketAnimationItem(getString(R.string.title_color_animation),
        new Intent(this, ColorAnimationActivity.class)));

    items.add(new RocketAnimationItem(getString(R.string.launch_spin),
        new Intent(this, LaunchAndSpinAnimatorSetAnimatorActivity.class)));

    items.add(new RocketAnimationItem(getString(R.string.launch_spin_viewpropertyanimator),
        new Intent(this, LaunchAndSpinViewPropertyAnimatorAnimationActivity.class)));

    items.add(new RocketAnimationItem(getString(R.string.title_with_doge),
        new Intent(this, FlyWithDogeAnimationActivity.class)));

    items.add(new RocketAnimationItem(getString(R.string.title_animation_events),
        new Intent(this, WithListenerAnimationActivity.class)));

    items.add(new RocketAnimationItem(getString(R.string.title_there_and_back),
        new Intent(this, FlyThereAndBackAnimationActivity.class)));

    items.add(new RocketAnimationItem(getString(R.string.title_jump_and_blink),
        new Intent(this, XmlAnimationActivity.class)));

    recyclerView.setAdapter(new RocketAdapter(this, items));

  }

}
