package com.centerprime.tronsdk.abi.datatypes;

import com.centerprime.tronsdk.abi.TypeReference;

import java.util.List;
import java.util.stream.Collectors;

import static com.centerprime.tronsdk.abi.Utils.convert;

/**
 * Event wrapper type.
 */
public class Event {
    private String name;
    private List<TypeReference<Type>> parameters;

    public Event(String name, List<TypeReference<?>> parameters) {
        this.name = name;
        this.parameters = convert(parameters);
    }

    public String getName() {
        return name;
    }

    public List<TypeReference<Type>> getParameters() {
        return parameters;
    }

    public List<TypeReference<Type>> getIndexedParameters() {
        return parameters.stream()
                .filter(TypeReference::isIndexed)
                .collect(Collectors.toList());
    }

    public List<TypeReference<Type>> getNonIndexedParameters() {
        return parameters.stream()
                .filter(p -> !p.isIndexed())
                .collect(Collectors.toList());
    }
}
