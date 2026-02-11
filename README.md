# FUZZAI - ZAP Java Add-on

The repo is a ZAP add-on that can be used to test AI models. 

FUZZAI provides a set of files for fuzzing AIs (for example via an API), based on a variety of different frameworks

In the current version, the payload cover the following major categories:
  - exploit-model-memory
  - extract-model-information
  - extract-training-data
  - test-edge-cases
  - OWASP LLM Top 10

Note: Payload files are formatted as one payload per line to support ZAP fuzzing compatibility.
