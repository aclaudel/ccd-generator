# CCD Header notes

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

##################
