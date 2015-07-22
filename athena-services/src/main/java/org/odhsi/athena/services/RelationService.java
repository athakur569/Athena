package org.odhsi.athena.services;

import org.odhsi.athena.dto.BrowserRelationWithConceptPagingResultDTO;

/**
 * Created by GMalikov on 21.07.2015.
 */
public interface RelationService {

    public BrowserRelationWithConceptPagingResultDTO getPagingRelationsForBrowser(int draw, int start, int length, String sortOrder, String searchValue, Long conceptId);

}
