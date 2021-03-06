/*
 *  Copyright(c) 2017 lizhaotailang
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

package io.github.marktony.espresso.interfaze;

import android.view.View;

/**
 * Created by lizhaotailang on 2017/2/11.
 * An interface for {@link android.support.v7.widget.RecyclerView} item.
 */

public interface OnRecyclerViewItemClickListener {

    void OnItemClick(View v, int position);

}
