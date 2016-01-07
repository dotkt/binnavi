/*
Copyright 2011-2016 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.API.debug;

import com.google.security.zynamics.binnavi.API.debug.raw.RegisterValues;
import com.google.security.zynamics.binnavi.API.disassembly.Address;
import com.google.security.zynamics.binnavi.debug.connection.packets.replies.SingleStepReply;

public class DebuggerSingleStepReply extends DebuggerReply {

  public DebuggerSingleStepReply(final SingleStepReply reply) {
    super(reply);
  }

  public Address getAddress() {
    return new Address(((SingleStepReply) reply).getAddress().getAddress().toBigInteger());
  }

  public RegisterValues getRegisterValues() {
    return new RegisterValues(((SingleStepReply) reply).getRegisterValues());
  }

  public long getThreadId() {
    return ((SingleStepReply) reply).getThreadId();
  }
}
