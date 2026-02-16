# Changelog
All notable changes to this add-on will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/).

## [0.0.5] - 2026-02-16
### Changed
- Expand OWASP Top 10 corpus with +5 realistic enterprise injection payloads per category (50 total additions) under `src/main/zapHomeFiles/fuzzers/fuzzai/OWASP_TOP_10`.
- Preserve one-payload-per-line formatting for ZAP compatibility across all appended payloads.
- Normalize `# Expected Response:` marker consistency in OWASP payload metadata.

## [0.0.4] - 2026-02-11
### Changed
- Normalize OWASP Top 10 payloads to single-line entries for ZAP compatibility.

## [0.0.3] - 2025-11-05
### Changed
- Update architecture prompts with indirect prompts

## [0.0.2] - 2025-09-25
### Added
- Test files for exploit model memory.
### Changed
- Re-organized help content and included URL links to the fuzzing file sources.
- Update edge cases.


## [0.0.1] - 2024-09-24
### Added
- First version
- Test files for edge cases.

### Changed
- Update minimum ZAP version to 2.16.0.

[0.0.1]: https://github.com/zaproxy/zap-extensions/releases/fuzzai-v0.0.1
