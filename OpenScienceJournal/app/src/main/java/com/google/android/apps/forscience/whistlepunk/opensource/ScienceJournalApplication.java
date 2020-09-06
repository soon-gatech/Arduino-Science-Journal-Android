/*
 *  Copyright 2016 Google Inc. All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.google.android.apps.forscience.whistlepunk.opensource;

import androidx.annotation.VisibleForTesting;
import com.google.android.apps.forscience.whistlepunk.WhistlePunkApplication;
import com.google.android.apps.forscience.whistlepunk.modules.ContextModule;
import com.google.android.apps.forscience.whistlepunk.opensource.components.DaggerOpenSourceComponent;

/** Subclass of WhistlePunkApplication which installs stub / default components. */
public class ScienceJournalApplication extends WhistlePunkApplication {
  @VisibleForTesting
  @Override
  public void onCreateInjector() {
    DaggerOpenSourceComponent.builder().contextModule(new ContextModule(this)).build().inject(this);
  }
}
