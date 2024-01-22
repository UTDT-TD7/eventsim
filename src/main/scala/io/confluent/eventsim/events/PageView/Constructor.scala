package io.confluent.eventsim.events.PageView

trait Constructor extends io.confluent.eventsim.events.Constructor {
  def setPage(s: String)

  def setAuth(s: String)

  def setMethod(s: String)

  def setStatus(i: Int)

  def setTrackId(s: String)

  def setArtist(s: String)

  def setTitle(s: String)

  def setDuration(d: Float)
}
