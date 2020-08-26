package model;

/**
 * Describes the operations available on a single path. A Path Item MAY be empty, due to ACL constraints. The path
 * itself is still exposed to the documentation viewer but they will not know which operations and parameters are available.
 */
public class Path {
    /**
     * Allows for an external definition of this path item. The referenced structure MUST be in the format of a Path
     * Item Object. In case a Path Item Object field appears both in the defined object and the referenced object,
     * the behavior is undefined.
     */
    private String ref;

    /**
     * An optional, string summary, intended to apply to all operations in this path.
     */
    private String summary	;

    /**
     * 	An optional, string description, intended to apply to all operations in this path. CommonMark syntax MAY be
     * 	used for rich text representation.
     */
    private String description;

    /**
     * A definition of a GET operation on this path.
     */
    private Operation get;

    /**
     * A definition of a PUT operation on this path.
     */
    private Operation put;

    /**
     * 	A definition of a POST operation on this path.
     */
    private Operation post;

    /**
     * A definition of a DELETE operation on this path.
     */
    private Operation delete;

    /**
     * A definition of a OPTIONS operation on this path.
     */
    private Operation options;

    /**
     * A definition of a HEAD operation on this path.
     */
    private Operation head;

    /**
     * A definition of a PATCH operation on this path.
     */
    private Operation patch;

    /**
     * A definition of a TRACE operation on this path.
     */
    private Operation trace;

    /**
     * An alternative server array to service all operations in this path.
     */
    private Server[] servers;

    /**
     * A list of parameters that are applicable for all the operations described under this path. These parameters
     * can be overridden at the operation level, but cannot be removed there. The list MUST NOT include duplicated
     * parameters. A unique parameter is defined by a combination of a name and location. The list can use the
     * Reference Object to link to parameters that are defined at the OpenAPI Object's components/parameters.
     */
    private Parameter[] parameters;

}
