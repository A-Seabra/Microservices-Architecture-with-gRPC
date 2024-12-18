# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc
import warnings

import inventory_pb2 as inventory__pb2

GRPC_GENERATED_VERSION = '1.64.0'
GRPC_VERSION = grpc.__version__
EXPECTED_ERROR_RELEASE = '1.65.0'
SCHEDULED_RELEASE_DATE = 'June 25, 2024'
_version_not_supported = False

try:
    from grpc._utilities import first_version_is_lower
    _version_not_supported = first_version_is_lower(GRPC_VERSION, GRPC_GENERATED_VERSION)
except ImportError:
    _version_not_supported = True

if _version_not_supported:
    warnings.warn(
        f'The grpc package installed is at version {GRPC_VERSION},'
        + f' but the generated code in inventory_pb2_grpc.py depends on'
        + f' grpcio>={GRPC_GENERATED_VERSION}.'
        + f' Please upgrade your grpc module to grpcio>={GRPC_GENERATED_VERSION}'
        + f' or downgrade your generated code using grpcio-tools<={GRPC_VERSION}.'
        + f' This warning will become an error in {EXPECTED_ERROR_RELEASE},'
        + f' scheduled for release on {SCHEDULED_RELEASE_DATE}.',
        RuntimeWarning
    )


class InventoryOptimizationStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Optimize = channel.unary_unary(
                '/inventory.InventoryOptimization/Optimize',
                request_serializer=inventory__pb2.OptimizeRequest.SerializeToString,
                response_deserializer=inventory__pb2.OptimizeResponse.FromString,
                _registered_method=True)
        self.Demand = channel.unary_unary(
                '/inventory.InventoryOptimization/Demand',
                request_serializer=inventory__pb2.DemandRequest.SerializeToString,
                response_deserializer=inventory__pb2.DemandResponse.FromString,
                _registered_method=True)


class InventoryOptimizationServicer(object):
    """Missing associated documentation comment in .proto file."""

    def Optimize(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Demand(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_InventoryOptimizationServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Optimize': grpc.unary_unary_rpc_method_handler(
                    servicer.Optimize,
                    request_deserializer=inventory__pb2.OptimizeRequest.FromString,
                    response_serializer=inventory__pb2.OptimizeResponse.SerializeToString,
            ),
            'Demand': grpc.unary_unary_rpc_method_handler(
                    servicer.Demand,
                    request_deserializer=inventory__pb2.DemandRequest.FromString,
                    response_serializer=inventory__pb2.DemandResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'inventory.InventoryOptimization', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))
    server.add_registered_method_handlers('inventory.InventoryOptimization', rpc_method_handlers)


 # This class is part of an EXPERIMENTAL API.
class InventoryOptimization(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def Optimize(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/inventory.InventoryOptimization/Optimize',
            inventory__pb2.OptimizeRequest.SerializeToString,
            inventory__pb2.OptimizeResponse.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

    @staticmethod
    def Demand(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/inventory.InventoryOptimization/Demand',
            inventory__pb2.DemandRequest.SerializeToString,
            inventory__pb2.DemandResponse.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)
