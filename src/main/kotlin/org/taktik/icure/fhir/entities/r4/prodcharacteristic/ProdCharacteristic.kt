//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package org.taktik.icure.fhir.entities.r4.prodcharacteristic

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import kotlin.String
import kotlin.collections.List
import org.taktik.icure.fhir.entities.r4.Quantity
import org.taktik.icure.fhir.entities.r4.attachment.Attachment
import org.taktik.icure.fhir.entities.r4.backboneelement.BackboneElement
import org.taktik.icure.fhir.entities.r4.codeableconcept.CodeableConcept
import org.taktik.icure.fhir.entities.r4.extension.Extension

/**
 * The marketing status describes the date when a medicinal product is actually put on the market or
 * the date as of which it is no longer available
 *
 * The marketing status describes the date when a medicinal product is actually put on the market or
 * the date as of which it is no longer available.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
class ProdCharacteristic(
  var color: List<String> = listOf(),
  /**
   * Where applicable, the depth can be specified using a numerical value and its unit of
   * measurement The unit of measurement shall be specified in accordance with ISO 11240 and the
   * resulting terminology The symbol and the symbol identifier shall be used
   */
  var depth: Quantity? = null,
  override var extension: List<Extension> = listOf(),
  /**
   * Where applicable, the external diameter can be specified using a numerical value and its unit
   * of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the
   * resulting terminology The symbol and the symbol identifier shall be used
   */
  var externalDiameter: Quantity? = null,
  /**
   * Where applicable, the height can be specified using a numerical value and its unit of
   * measurement The unit of measurement shall be specified in accordance with ISO 11240 and the
   * resulting terminology The symbol and the symbol identifier shall be used
   */
  var height: Quantity? = null,
  /**
   * Unique id for inter-element referencing
   */
  override var id: String? = null,
  var image: List<Attachment> = listOf(),
  var imprint: List<String> = listOf(),
  override var modifierExtension: List<Extension> = listOf(),
  /**
   * Where applicable, the nominal volume can be specified using a numerical value and its unit of
   * measurement The unit of measurement shall be specified in accordance with ISO 11240 and the
   * resulting terminology The symbol and the symbol identifier shall be used
   */
  var nominalVolume: Quantity? = null,
  /**
   * Where applicable, the scoring can be specified An appropriate controlled vocabulary shall be
   * used The term and the term identifier shall be used
   */
  var scoring: CodeableConcept? = null,
  /**
   * Where applicable, the shape can be specified An appropriate controlled vocabulary shall be used
   * The term and the term identifier shall be used
   */
  var shape: String? = null,
  /**
   * Where applicable, the weight can be specified using a numerical value and its unit of
   * measurement The unit of measurement shall be specified in accordance with ISO 11240 and the
   * resulting terminology The symbol and the symbol identifier shall be used
   */
  var weight: Quantity? = null,
  /**
   * Where applicable, the width can be specified using a numerical value and its unit of
   * measurement The unit of measurement shall be specified in accordance with ISO 11240 and the
   * resulting terminology The symbol and the symbol identifier shall be used
   */
  var width: Quantity? = null
) : BackboneElement
