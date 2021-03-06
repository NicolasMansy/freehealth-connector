//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package org.taktik.icure.fhir.entities.r4.timing

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import org.taktik.icure.fhir.entities.r4.Element
import org.taktik.icure.fhir.entities.r4.duration.Duration
import org.taktik.icure.fhir.entities.r4.extension.Extension
import org.taktik.icure.fhir.entities.r4.period.Period
import org.taktik.icure.fhir.entities.r4.range.Range

/**
 * When the event is to occur
 *
 * A set of rules that describe when the event is scheduled.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
class TimingRepeat(
  /**
   * Length/Range of lengths, or (Start and/or end) limits
   */
  var boundsDuration: Duration? = null,
  /**
   * Length/Range of lengths, or (Start and/or end) limits
   */
  var boundsPeriod: Period? = null,
  /**
   * Length/Range of lengths, or (Start and/or end) limits
   */
  var boundsRange: Range? = null,
  /**
   * Number of times to repeat
   */
  var count: Int? = null,
  /**
   * Maximum number of times to repeat
   */
  var countMax: Int? = null,
  var dayOfWeek: List<String> = listOf(),
  /**
   * How long when it happens
   */
  var duration: Float? = null,
  /**
   * How long when it happens (Max)
   */
  var durationMax: Float? = null,
  /**
   * s | min | h | d | wk | mo | a - unit of time (UCUM)
   */
  var durationUnit: String? = null,
  override var extension: List<Extension> = listOf(),
  /**
   * Event occurs frequency times per period
   */
  var frequency: Int? = null,
  /**
   * Event occurs up to frequencyMax times per period
   */
  var frequencyMax: Int? = null,
  /**
   * Unique id for inter-element referencing
   */
  override var id: String? = null,
  /**
   * Minutes from event (before or after)
   */
  var offset: Int? = null,
  /**
   * Event occurs frequency times per period
   */
  var period: Float? = null,
  /**
   * Upper limit of period (3-4 hours)
   */
  var periodMax: Float? = null,
  /**
   * s | min | h | d | wk | mo | a - unit of time (UCUM)
   */
  var periodUnit: String? = null,
  var timeOfDay: List<String> = listOf(),
  @JsonProperty("when")
  var when_fhir: List<String> = listOf()
) : Element
