package org.lili.dto.wsdto;

import java.util.List;

/**
 * @packgeName: org.lili.dto.wsdto
 * @ClassName: ErrorListWsDTO
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-18:42
 * @version: 1.0
 * @since: JDK 1.8
 */

public class ErrorListWsDTO  implements java.io.Serializable {

    /** <i>Generated property</i> for <code>ErrorListWsDTO.errors</code> property defined at extension <code>commercewebservicescommons</code>. */
    private List<ErrorWsDTO> errors;

    public ErrorListWsDTO()
    {
        // default constructor
    }


    public void setErrors(final List<ErrorWsDTO> errors)
    {
        this.errors = errors;
    }


    public List<ErrorWsDTO> getErrors()
    {
        return errors;
    }


}
