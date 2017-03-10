package com.search.engine.property.core.mapper;

import com.search.engine.property.core.persistence.entity.CodeLabelEntity;
import com.search.engine.property.ws.rest.model.CodeLabel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-03-10T11:31:55+0100",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_112 (Oracle Corporation)"
)
public class CodeLabelMapperImpl implements CodeLabelMapper {

    @Override
    public CodeLabel asCodeLabel(CodeLabelEntity in) {
        if ( in == null ) {
            return null;
        }

        CodeLabel codeLabel = new CodeLabel();

        codeLabel.setCode( in.getCode() );
        codeLabel.setValue( in.getValue() );
        codeLabel.setLabel( in.getLabel() );

        return codeLabel;
    }

    @Override
    public List<CodeLabel> asCodeLabels(List<CodeLabelEntity> in) {
        if ( in == null ) {
            return null;
        }

        List<CodeLabel> list = new ArrayList<CodeLabel>();
        for ( CodeLabelEntity codeLabelEntity : in ) {
            list.add( asCodeLabel( codeLabelEntity ) );
        }

        return list;
    }
}
