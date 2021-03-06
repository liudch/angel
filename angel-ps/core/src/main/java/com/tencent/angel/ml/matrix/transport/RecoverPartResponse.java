/*
 * Tencent is pleased to support the open source community by making Angel available.
 *
 * Copyright (C) 2017 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the BSD 3-Clause License (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package com.tencent.angel.ml.matrix.transport;

/**
 * The result of update matrix partition rpc request.
 */
public class RecoverPartResponse extends Response {

  /**
   * Create a new RecoverPartResponse.
   */
  public RecoverPartResponse() {
    super();
  }

  /**
   * Create a new RecoverPartResponse.
   *
   * @param type response type
   */
  public RecoverPartResponse(ResponseType type) {
    super(type);
  }

  /**
   * Create a new RecoverPartResponse.
   *
   * @param type response type
   * @param message detail error information if the rpc response is error
   */
  public RecoverPartResponse(ResponseType type, String message) {
    super(type, message);
  }
}
