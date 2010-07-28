/**
 * Licensed to Cloudera, Inc. under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  Cloudera, Inc. licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cloudera.flume.conf;

import java.util.Set;

import com.cloudera.flume.core.EventSource;

/**
 * Simple interface for building EventSource's
 * 
 * If build fails due to bad arguments, it should throw Illegal*Exceptions
 */
abstract public class SourceFactory {
  abstract public static class SourceBuilder {
    public abstract EventSource build(String... argv);
  };

  abstract public EventSource getSource(String name, String... args)
      throws FlumeSpecException;

  /**
   * Returns the list of sources that we can instantiate
   */
  abstract public Set<String> getSourceNames();
}
