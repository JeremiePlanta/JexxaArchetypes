#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain.book;

import io.jexxa.addend.applicationcore.BusinessException;

import java.io.Serial;

/**
 * Is thrown in case we try to sell a book that is currently not in stock
 */
@BusinessException
public class BookNotInStockException extends Exception
{
    @Serial
    private static final long serialVersionUID = 1L;
}
