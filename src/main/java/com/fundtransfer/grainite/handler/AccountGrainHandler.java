package com.fundtransfer.grainite.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.grainite.api.context.Action;
import com.grainite.api.context.Action.TopicEvent;
import com.grainite.api.context.ActionResult;
import com.grainite.api.context.GrainContext;

public class AccountGrainHandler {

  public ActionResult handleRequestPay(Action action, GrainContext context) {
    context.getLogger().info("Handle RequestPay Subscription Running");
    ObjectMapper obj = new ObjectMapper();

    try {
      context.getLogger().info(((TopicEvent) action).getPayload().asString());
      context.getLogger().info(context.getValue().asString());
    } catch (Exception e) {
      context.getLogger().warning("Exception in handleRequestPay");
      return ActionResult.failure(action, e);
    }
  
    return ActionResult.success(action);
  }

}
