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

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class RocketAdapter extends RecyclerView.Adapter<RocketAdapter.RocketViewHolder> {

    private final List<RocketAnimationItem> mItems;
    private final Context mContext;

    public RocketAdapter(Context context, List<RocketAnimationItem> items) {
        super();
        mContext = context;
        mItems = items;
    }

    @Override
    public RocketViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem, parent, false);
        return new RocketViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RocketAdapter.RocketViewHolder holder, int position) {
        holder.mTitle.setText(mItems.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return mItems == null ? 0 : mItems.size();
    }

    class RocketViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        public final TextView mTitle;

        public RocketViewHolder(android.view.View itemView) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(android.R.id.text1);
            mTitle.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mContext.startActivity(mItems.get(getAdapterPosition()).getIntent());
                        }
                    });
        }
    }
}
