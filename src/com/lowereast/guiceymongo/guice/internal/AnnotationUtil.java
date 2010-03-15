/**
 *      Copyright (C) 2010 Lowereast Software
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.lowereast.guiceymongo.guice.internal;

import com.google.inject.internal.ImmutableMap;
import com.lowereast.guiceymongo.annotation.Annotations;
import com.lowereast.guiceymongo.guice.annotation.GuiceyMongoCollection;
import com.lowereast.guiceymongo.guice.annotation.GuiceyMongoDatabase;

final class AnnotationUtil {
	private AnnotationUtil() {}
	
	public static ConfiguredCollection configuredCollection(String configuration, String collectionKey) {
		return Annotations.proxy(ConfiguredCollection.class, ImmutableMap.<String, Object>of("configuration", configuration, "collection", collectionKey));
	}
	
	public static ConfiguredConnection configuredConnectionHostname(String connection) {
		return Annotations.proxy(ConfiguredConnection.class, ImmutableMap.<String, Object>of("connection", connection, "key", "hostname"));
	}
	
	public static ConfiguredConnection configuredConnectionPort(String connection) {
		return Annotations.proxy(ConfiguredConnection.class, ImmutableMap.<String, Object>of("connection", connection, "key", "port"));
	}
	
	public static ConfiguredDatabaseConnection configuredDatabaseConnection(String configuration, String databaseKey) {
		return Annotations.proxy(ConfiguredDatabaseConnection.class, ImmutableMap.<String, Object>of("configuration", configuration, "database", databaseKey));
	}
	
	public static ConfiguredDatabase configuredDatabase(String configuration, String databaseKey) {
		return Annotations.proxy(ConfiguredDatabase.class, ImmutableMap.<String, Object> of("configuration", configuration, "database", databaseKey));
	}
	
	public static GuiceyMongoCollection guiceyMongoCollection(String collectionKey) {
		return Annotations.proxy(GuiceyMongoCollection.class, ImmutableMap.<String, Object>of("value", collectionKey));
	}
	
	public static GuiceyMongoDatabase guiceyMongoDatabase(String databaseKey) {
		return Annotations.proxy(GuiceyMongoDatabase.class, ImmutableMap.<String, Object>of("value", databaseKey));
	}
}
