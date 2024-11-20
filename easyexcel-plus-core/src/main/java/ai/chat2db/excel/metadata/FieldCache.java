package ai.chat2db.excel.metadata;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * filed cache
 *
 * @author Jiaju Zhuang
 */
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class FieldCache {

    /**
     * A field cache that has been sorted by a class.
     * It will exclude fields that are not needed.
     */
    private Map<Integer, FieldWrapper> sortedFieldMap;

    /**
     * Fields using the index attribute
     */
    private Map<Integer, FieldWrapper> indexFieldMap;
}
