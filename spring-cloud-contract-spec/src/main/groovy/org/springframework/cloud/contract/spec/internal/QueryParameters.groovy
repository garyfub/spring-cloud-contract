/*
 *  Copyright 2013-2017 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.springframework.cloud.contract.spec.internal

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TypeChecked

@EqualsAndHashCode
@ToString(includePackage = false, ignoreNulls = true, includeNames = true)
@TypeChecked
class QueryParameters  {

	List<QueryParameter> parameters = []

	void parameter(Map<String, Object> singleParameter) {
		Map.Entry<String, Object> first = singleParameter.entrySet().first()
		parameters << new QueryParameter(first?.key, first?.value)
	}

	void parameter(String parameterName, Object parameterValue) {
		parameters << new QueryParameter(parameterName, parameterValue)
	}

}
