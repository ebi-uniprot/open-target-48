package uk.ac.ebi.uniprot.opentargets48.uniprot.models;

import java.util.List;
import lombok.Data;

@Data
public class UniProtEntry {
  private final String Id;
  private final String accession;
  private final List<String> functions;
  private final List<String> complexIds;
}