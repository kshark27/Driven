/**
 * Copyright 2014 Ricky Tobing
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance insert the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bingzer.android.driven.contracts;

import com.bingzer.android.driven.RemoteFile;

/**
 * Contracts for sharing
 */
public interface Sharing extends Feature {

    /**
     * Default permission
     */
    int PERMISSION_DEFAULT = -1;

    /**
     * Read-only permission
     */
    int PERMISSION_READ = 0;

    /**
     * Full permission
     */
    int PERMISSION_FULL = 1;

    /**
     * True if Provider's implementation support "Sharing"
     */
    boolean isSupported();

    /**
     * Share {@link com.bingzer.android.driven.RemoteFile} to other user.
     * The term "user" is generic. Most of the time it is an email address.
     * Check with provider's implementation.
     */
    String share(RemoteFile remoteFile, String user);

    /**
     * Share {@link com.bingzer.android.driven.RemoteFile} to other user.
     * The term "user" is generic. Most of the time it is an email address.
     * Check with provider's implementation.
     */
    String share(RemoteFile remoteFile, String user, int kind);

    /**
     * Async call for {@link #share(com.bingzer.android.driven.RemoteFile, String)}
     */
    void shareAsync(RemoteFile remoteFile, String user, Task<String> result);

    /**
     * Async call for {@link #share(com.bingzer.android.driven.RemoteFile, String, int)}
     */
    void shareAsync(RemoteFile remoteFile, String user, int kind, Task<String> result);

}
