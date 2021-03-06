package com.smartsheet.api.retry;
/*
 * #[license]
 * Smartsheet SDK for Java
 * %%
 * Copyright (C) 2017 Smartsheet
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * %[license]
 */

import com.smartsheet.api.SmartsheetException;
import com.smartsheet.api.internal.http.HttpResponse;

import java.io.IOException;

/**
 * Interface for user provided retry callbacks
 */
public interface ShouldRetry {
    /**
     * Callback interface to determine if this request can be retried.
     *
     * @param previousAttempts
     * @param totalElapsedTimeMillis
     * @param response
     * @return a boolean indicating if the API call can be retried.
     */
    boolean shouldRetry(int previousAttempts, long totalElapsedTimeMillis, HttpResponse response);
}
