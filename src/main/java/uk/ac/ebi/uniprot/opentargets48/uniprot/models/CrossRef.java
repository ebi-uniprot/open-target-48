package uk.ac.ebi.uniprot.opentargets48.uniprot.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Map;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
@Data
public class CrossRef {
  private final String Id;
  private final String name;
  private String url;
  private String alternativeUrl;

  public static CrossRef from(Map<String, String> ref) {
    return new CrossRef(ref.get("Id"), ref.get("name"));
  }
}
