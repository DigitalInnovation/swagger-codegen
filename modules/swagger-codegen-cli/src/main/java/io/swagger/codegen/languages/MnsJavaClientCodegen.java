package io.swagger.codegen.languages;

import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.CodegenModel;
import io.swagger.codegen.CodegenProperty;

public class MnsJavaClientCodegen extends JavaClientCodegen implements CodegenConfig {


    public MnsJavaClientCodegen() {
        super();
    }

    @Override
    public String getName() {
        return "java";
    }

    @Override
    public String getHelp() {
        return "Generates a Java client library for M&S.";
    }

    @Override
    public void postProcessModelProperty(CodegenModel model, CodegenProperty property) {

        if ("array".equals(property.containerType)) {
          model.imports.add("ArrayList");
        } else if ("map".equals(property.containerType)) {
          model.imports.add("HashMap");
        }

        model.imports.remove("ToStringSerializer");
        model.imports.remove("JsonSerialize");

        model.imports.remove("ApiModelProperty");
        model.imports.remove("ApiModel");
        model.imports.remove("JsonProperty");
        model.imports.remove("JsonValue");
        model.imports.remove("Objects");
        model.imports.remove("StringUtil");

    }

}
