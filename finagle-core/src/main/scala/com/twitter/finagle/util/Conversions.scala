package com.twitter.finagle.util

import org.jboss.netty.channel.ChannelFuture

object Conversions {
  implicit def channelFutureToRichChannelFuture(f: ChannelFuture) = new RichChannelFuture(f)
}
