// TARGET_BACKEND: WASM

// RUN_THIRD_PARTY_OPTIMIZER
// WASM_DCE_EXPECTED_OUTPUT_SIZE: wasm 16_464
// WASM_DCE_EXPECTED_OUTPUT_SIZE:  mjs  5_838
// WASM_OPT_EXPECTED_OUTPUT_SIZE:       4_364

fun box() = "OK"