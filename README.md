# CCD Header notes

## XML Namespace

With JAXB, the namespace prefix is ns2.
If it's a problem, we can still change it using `@XmlSchema` in `package-info.java`.

## XML tags

### id
```xml
<!-- Globally unique identifier for the document  -->
<id root="2.16.840.1.113883.19.5.99999.1"
    extension="TT988"/>
```
- Where do we retrieve the values for root and extension?
- Is ID unique to the instance
or to an abstract document (which can have multiple instances)?

### code
```xml
<code code="34133-9" 
    displayName="Summarization of Episode Note" 
    codeSystem="2.16.840.1.113883.6.1" 
    codeSystemName="LOINC"/>
```
- Where do we retrieve it?
- Can we determine this from the workflow?

### title
- How do we know which title to put / should we use the displayName?
 
### confidentialityCode
```xml
<confidentialityCode 
    code="N" 
    displayName="normal" 
    codeSystem="2.16.840.1.113883.5.25" 
    codeSystemName="Confidentiality"/>
```
- Is it dynamic? If so, where do we retrieve it?

### language
- Is it always `en-US`

### name/given
- voorvoegsel
- Does `suffix` exist? Because it's used in the example in the implementation guide