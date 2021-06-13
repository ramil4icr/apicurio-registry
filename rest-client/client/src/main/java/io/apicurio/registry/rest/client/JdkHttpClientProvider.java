/*
 * Copyright 2021 Red Hat
 *
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
 */

package io.apicurio.registry.rest.client;

import io.apicurio.registry.auth.Auth;
import io.apicurio.registry.rest.client.spi.RestClientProvider;

import java.util.Map;

public class JdkHttpClientProvider implements RestClientProvider {

    @Override
    public RegistryHttpClient create(String endpoint, Map<String, Object> configs, Auth auth) {
        return new JdkHttpClient(endpoint, configs, auth);
    }
}