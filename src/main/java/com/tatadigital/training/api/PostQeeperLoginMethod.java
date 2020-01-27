/*
 * Copyright 2013-2018 QAPROSOFT (http://qaprosoft.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tatadigital.training.api;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostQeeperLoginMethod extends AbstractApiMethodV2 {
	Properties prop = new Properties();
	
    public PostQeeperLoginMethod() {
        super("api/qeeper/_post/login_rq.json", "api/qeeper/_post/login_rs.json", "api/qeeper/login.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));

        getProperties().replace("username","username");

//        replaceUrlPlaceholder("username", prop.getProperty("username"));
//        replaceUrlPlaceholder("password", prop.getProperty("password"));
    }
}
